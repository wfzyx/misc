import tensorflow as tf
from sklearn import metrics, model_selection
from tensorflow.contrib import learn

# load datasets
# iris = learn.datasets.load_datasets('iris')
iris = learn.datasets.load_iris()
# use scikit.learn.datasets in the future
x_train, x_test, y_train, y_test = model_selection.train_test_split(
    iris.data, iris.target, test_size=0.2, random_state=42
)
# build 3 layer DNN with 10 20 10 units respectively
feature_columns = [tf.contrib.layers.real_valued_column("", dimension=1)]
classifier = learn.DNNClassifier(
    feature_columns=feature_columns, hidden_units=[10, 20, 10], n_classes=3
)
# fit and predict
classifier.fit(x_train, y_train, steps=200)
x_predict = classifier.predict_classes(x_test)
x_predict = [x for x in x_predict]
score = metrics.accuracy_score(y_test, x_predict)
print("Accuracy: {0:f}".format(score))
