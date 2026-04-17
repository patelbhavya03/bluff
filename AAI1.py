import numpy as np

class HiddenMarkovModel:
    def __init__(self, A, B, pi):
        """
        A: Transition matrix (N x N)
        B: Emission matrix (N x M)
        pi: Initial state probabilities (N,)
        """
        self.A = np.array(A)
        self.B = np.array(B)
        self.pi = np.array(pi)
        self.N = self.A.shape[0]  # number of states

    def forward(self, observations):
        T = len(observations)
        alpha = np.zeros((T, self.N))

        # Initialization
        alpha[0] = self.pi * self.B[:, observations[0]]

        # Recursion
        for t in range(1, T):
            for j in range(self.N):
                alpha[t, j] = np.sum(alpha[t-1] * self.A[:, j]) * self.B[j, observations[t]]

        # Termination
        return np.sum(alpha[-1])

    def viterbi(self, observations):
        T = len(observations)
        delta = np.zeros((T, self.N))
        psi = np.zeros((T, self.N), dtype=int)

        # Initialization
        delta[0] = self.pi * self.B[:, observations[0]]

        # Recursion
        for t in range(1, T):
            for j in range(self.N):
                probs = delta[t-1] * self.A[:, j]
                psi[t, j] = np.argmax(probs)
                delta[t, j] = np.max(probs) * self.B[j, observations[t]]

        # Backtracking
        states = np.zeros(T, dtype=int)
        states[-1] = np.argmax(delta[-1])

        for t in reversed(range(T-1)):
            states[t] = psi[t+1, states[t+1]]

        return states


# Example usage
if __name__ == "__main__":
    # States: Rainy(0), Sunny(1)
    # Observations: Walk(0), Shop(1), Clean(2)

    A = [[0.7, 0.3],
         [0.4, 0.6]]

    B = [[0.1, 0.4, 0.5],
         [0.6, 0.3, 0.1]]

    pi = [0.6, 0.4]

    model = HiddenMarkovModel(A, B, pi)

    observations = [0, 1, 2]  # Walk, Shop, Clean

    print("Sequence probability:", model.forward(observations))
    print("Most likely states:", model.viterbi(observations))