package com.intense.mlapi;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.BinomialModelPrediction;
import hex.genmodel.easy.prediction.RegressionModelPrediction;
import hex.genmodel.GenModel;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class PredictionService {

    private final EasyPredictModelWrapper model;
    private final String modelType;

    public PredictionService() throws Exception {

        String modelsPath = "src\\main\\java\\com\\intense\\mlapi\\models";
        String modelFileName = getModelFileName(modelsPath);

        if (modelFileName == null) {
            throw new Exception("Model file not found in the directory: " + modelsPath);
        }

        String modelClassName = "com.intense.mlapi.models." + modelFileName;
        System.out.println("######### modelClassName ######## " + modelClassName);

        Class<?> modelClass = Class.forName(modelClassName);
        GenModel genModel = (GenModel) modelClass.getDeclaredConstructor().newInstance();
        this.model = new EasyPredictModelWrapper(genModel);

        this.modelType = genModel.getModelCategory().toString();
        System.out.println("######### Model Type ######## " + modelType);

    }

    private String getModelFileName(String modelsPath) {
        File dir = new File(modelsPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".java"));

        if (files != null && files.length > 0) {
            return files[0].getName().replace(".java", "");
        }
        return null;
    }

    public Object predict(RowData rowData) throws Exception {
        switch (modelType) {
            case "Binomial":
                return model.predictBinomial(rowData); 
            case "Regression":
                return model.predictRegression(rowData); 
            case "Clustering":
                return model.predictClustering(rowData); 
            case "DimReduction":
                return model.predictDimReduction(rowData); 
            case "Multinomial":
                return model.predictMultinomial(rowData); 
            case "Ordinal":
                return model.predictOrdinal(rowData);
            case "AnomalyDetection":
                return model.predictAnomalyDetection(rowData);
            case "UpliftBinomial":
                return model.predictUpliftBinomial(rowData);
            default:
                throw new UnsupportedOperationException("Model type  not supported");
        }
    }
}
