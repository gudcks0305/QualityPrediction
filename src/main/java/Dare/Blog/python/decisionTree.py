import pandas as pd
from sklearn.preprocessing import LabelBinarizer
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import classification_report
from sklearn.tree import export_graphviz
from sklearn import clone
from sklearn.ensemble import ExtraTreesClassifier, RandomForestClassifier
from IPython.core.display import Image
import matplotlib as mpl
import matplotlib.pylab as plt
import numpy as np
import seaborn as sns
import sys
import pymysql
import pandas as pd
import joblib
# Some other example server values are
# server = 'localhost\sqlexpress' # for a named instance
# server = 'myserver,port' # to specify an alternate port

model1 = joblib.load('C:\JavaSpring\DareBlog\src\main\java\Dare\Blog\python\RandomTreeModel.pkl')


def defectiveDecision(a,b,c,d,e) :
    new_data = np.array([[a,b,c,d,e]])
    predict_value = model1.predict(new_data)
    return predict_value


def main(argv):
    print(defectiveDecision(argv[1], argv[2],argv[3],argv[4],argv[5]))

if __name__ == "__main__":
    main(sys.argv)