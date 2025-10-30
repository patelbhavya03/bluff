3 import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metric3 s import accuracy_score, confusion_matrix, classification_report

# Step 1: Load dataset
df = pd.read_csv("iris.csv")   # Ensure iris.csv is in the same folder as this file
print("Dataset loaded successfully.\n")

# Step 2: Display first 5 records
print("First 5 rows of the dataset:\n")
print(df.head())
print("\n")

# Step 3: Separate features and target
# Assuming last column is the target (Species)
X = df.iloc[:, :-1]   # all columns except last
y = df.iloc[:, -1]    # last column

# Step 4: Split data into training and testing sets (80% - 20%)
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=0
)
print("Data split into training and testing sets.\n")

# Step 5: Create and train the Naive Bayes model
model = GaussianNB()
model.fit(X_train, y_train)
print("Model trained successfully.\n")

# Step 6: Make predictions on test data
y_pred = model.predict(X_test)

# Step 7: Evaluate the model
print("Predictions:\n", y_pred, "\n")
print("Accuracy:", round(accuracy_score(y_test, y_pred) * 100, 2), "%\n")
print("Confusion Matrix:\n", confusion_matrix(y_test, y_pred), "\n")
print("Classification Report:\n", classification_report(y_test, y_pred))
print("Naive Bayes classification completed successfully.")
