from tkinter import DoubleVar
from flask import Flask  # 서버 구현을 위한 Flask 객체 import
from flask_restx import Api, Resource  # Api 구현을 위한 Api 객체 import
import sklearn.externals
import joblib 
from decimal import Decimal
from flask_restful import reqparse
import numpy as np
import pickle

app = Flask(__name__)  # Flask 객체 선언, 파라미터로 어플리케이션 패키지의 이름을 넣어줌.
api = Api(app)  # Flask 객체에 Api 객체 등록


@api.route('/api')  # 데코레이터 이용, '/hello' 경로에 클래스 등록
class DecisionTreeAPI(Resource):
   
    def get(self) :
        
        parser = reqparse.RequestParser()
        parser.add_argument('MeanTemp', type=str)
        parser.add_argument('CjOutC1', type=str)
        parser.add_argument('CjOutC2', type=str)
        parser.add_argument('CjOutD3', type=str)
        parser.add_argument('inD3', type=str)
        
        args = parser.parse_args()
        MeanTemp = args['MeanTemp']
        CjOutC1 = args['CjOutC1']
        CjOutC2 = args['CjOutC2']
        CjOutD3 = args['CjOutD3']
        inD3 = args['inD3']
        new_data = np.array([[MeanTemp,CjOutC1,CjOutC2,CjOutD3,inD3]])
        predict = model.predict(new_data)
        
        
        #return int(predict)
        return {'MeanTemp':  args['MeanTemp'], 'CjOutC1': args['CjOutC1'], 'CjOutC2':args['CjOutC2'] , 'CjOutD3':args['CjOutD3'] ,'inD3':  args['inD3'] , 'predict' : int(predict)}
if __name__ == "__main__":
    model = joblib.load('app\RandomTreeModel.pkl')
    
    app.run(debug=True, host='0.0.0.0', port=8000)