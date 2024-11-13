package com.intense.mlapi;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.BinomialModelPrediction;
import java.io.File;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private final EasyPredictModelWrapper model;

    public PredictionService() throws Exception {
        
        String modelsPath = "src\\main\\java\\com\\intense\\mlapi\\models";
        
        
        String modelFileName = getModelFileName(modelsPath);

        if (modelFileName == null) {
            throw new Exception("Model file not found in the directory: " + modelsPath);
        }

        // Construct the class name based on the file name
        // String modelClassName = modelsPath.replace("/", ".") + modelFileName;

        String modelClassName = "com.intense.mlapi.models." + modelFileName;
        

        System.out.println("######### modelClassName ######## " + modelClassName);

        
        Class<?> modelClass = Class.forName(modelClassName);
        this.model = new EasyPredictModelWrapper((hex.genmodel.GenModel) modelClass.getDeclaredConstructor().newInstance());
    }

    
    private String getModelFileName(String modelsPath) {
        File dir = new File(modelsPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".java"));

        if (files != null && files.length > 0) {
            return files[0].getName().replace(".java", "");
        }
        return null;
    }

    public BinomialModelPrediction predict(RowData rowData) throws Exception {
        return model.predictBinomial(rowData);
    }
}

