/*
  Licensed under the Apache License, Version 2.0
    http://www.apache.org/licenses/LICENSE-2.0.html

  AUTOGENERATED BY H2O at 2024-12-19T15:46:43.967+05:30
  3.47.0.99999
  
  Standalone prediction code with sample test data for GBMModel named gbm_c3dff332_c747_4865_906f_7ab2c6623a31

  How to download, compile and execute:
      mkdir tmpdir
      cd tmpdir
      curl http://172.16.0.18:54321/3/h2o-genmodel.jar > h2o-genmodel.jar
      curl http://172.16.0.18:54321/3/Models.java/gbm-c3dff332-c747-4865-906f-7ab2c6623a31 > gbm_c3dff332_c747_4865_906f_7ab2c6623a31.java
      javac -cp h2o-genmodel.jar -J-Xmx2g -J-XX:MaxPermSize=128m gbm_c3dff332_c747_4865_906f_7ab2c6623a31.java

     (Note:  Try java argument -XX:+PrintCompilation to show runtime JIT compiler behavior.)
*/
package com.intense.mlapi.models;
import java.util.Map;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="gbm_c3dff332_c747_4865_906f_7ab2c6623a31", algorithm="gbm")
public class gbm_c3dff332_c747_4865_906f_7ab2c6623a31 extends GenModel {
  public hex.ModelCategory getModelCategory() { return hex.ModelCategory.Binomial; }

  public boolean isSupervised() { return true; }
  public int nfeatures() { return 7; }
  public int nclasses() { return 2; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_gbm_c3dff332_c747_4865_906f_7ab2c6623a31.VALUES;
  // Number of output classes included in training data response column.
  public static final int NCLASSES = 2;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* Claim Reason */ gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_0.VALUES,
    /* Data confidentiality */ gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_1.VALUES,
    /* Claim Amount */ null,
    /* Category Premium */ null,
    /* Premium/Amount Ratio */ null,
    /* Claim Request output */ gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_5.VALUES,
    /* BMI */ null,
    /* Churn */ gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_7.VALUES
  };
  // Prior class distribution
  public static final double[] PRIOR_CLASS_DISTRIB = {0.3645706369346148,0.6354293630653852};
  // Class distribution used for model building
  public static final double[] MODEL_CLASS_DISTRIB = {0.3645706369346148,0.6354293630653852};

  public gbm_c3dff332_c747_4865_906f_7ab2c6623a31() { super(NAMES,DOMAINS,"Churn"); }
  public String getUUID() { return Long.toString(-8746328346523490454L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    java.util.Arrays.fill(preds,0);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_0.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_1.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_2.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_3.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_4.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_5.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_6.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_7.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_8.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_9.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_10.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_11.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_12.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_13.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_14.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_15.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_16.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_17.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_18.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_19.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_20.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_21.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_22.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_23.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_24.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_25.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_26.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_27.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_28.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_29.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_30.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_31.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_32.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_33.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_34.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_35.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_36.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_37.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_38.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_39.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_40.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_41.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_42.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_43.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_44.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_45.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_46.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_47.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_48.score0(data,preds);
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_49.score0(data,preds);
    preds[2] = preds[1] + 0.5555806087162287;
    preds[2] = 1./(1. + Math.min(1e19, Math.exp(-(preds[2]))));
    preds[1] = 1.0-preds[2];
    preds[0] = hex.genmodel.GenModel.getPrediction(preds, PRIOR_CLASS_DISTRIB, data, 0.9975997438699585);
    return preds;
  }
}
// The class representing training column names
class NamesHolder_gbm_c3dff332_c747_4865_906f_7ab2c6623a31 implements java.io.Serializable {
  public static final String[] VALUES = new String[7];
  static {
    NamesHolder_gbm_c3dff332_c747_4865_906f_7ab2c6623a31_0.fill(VALUES);
  }
  static final class NamesHolder_gbm_c3dff332_c747_4865_906f_7ab2c6623a31_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "Claim Reason";
      sa[1] = "Data confidentiality";
      sa[2] = "Claim Amount";
      sa[3] = "Category Premium";
      sa[4] = "Premium/Amount Ratio";
      sa[5] = "Claim Request output";
      sa[6] = "BMI";
    }
  }
}
// The class representing column Claim Reason
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_0 implements java.io.Serializable {
  public static final String[] VALUES = new String[4];
  static {
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_0_0.fill(VALUES);
  }
  static final class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_0_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "Medical";
      sa[1] = "Other";
      sa[2] = "Phone";
      sa[3] = "Travel";
    }
  }
}
// The class representing column Data confidentiality
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_1 implements java.io.Serializable {
  public static final String[] VALUES = new String[4];
  static {
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_1_0.fill(VALUES);
  }
  static final class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_1_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "High";
      sa[1] = "Low";
      sa[2] = "Medium";
      sa[3] = "Very low";
    }
  }
}
// The class representing column Claim Request output
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_5 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_5_0.fill(VALUES);
  }
  static final class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_5_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "No";
      sa[1] = "Yes";
    }
  }
}
// The class representing column Churn
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_7 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_7_0.fill(VALUES);
  }
  static final class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_ColInfo_7_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "No";
      sa[1] = "Yes";
    }
  }
}

class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_0 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_0_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_0_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.1573739f : 
        -0.27429527f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_1 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_1_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_1_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.14901938f : 
        -0.23248315f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_2 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_2_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_2_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.14223276f : 
        -0.20500128f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_3 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_3_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_3_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.13663352f : 
        -0.18553889f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_4 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_4_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_4_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.13195504f : 
        -0.17105344f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_5 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_5_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_5_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.12800477f : 
        -0.15988217f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_6 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_6_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_6_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.12463997f : 
        -0.15103424f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_7 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_7_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_7_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.12175253f : 
        -0.14388016f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_8 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_8_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_8_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.119258985f : 
        -0.13799985f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_9 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_9_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_9_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.117093846f : 
        -0.13310163f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_10 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_10_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_10_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.11520501f : 
        -0.12897637f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_11 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_11_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_11_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.113550454f : 
        -0.12547009f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_12 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_12_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_12_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.11209593f : 
        -0.122466706f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_13 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_13_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_13_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.11081326f : 
        -0.119877085f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_14 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_14_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_14_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10967901f : 
        -0.11763156f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_15 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_15_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_15_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10867358f : 
        -0.115674876f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_16 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_16_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_16_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.1077804f : 
        -0.11396263f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_17 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_17_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_17_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.106985435f : 
        -0.11245873f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_18 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_18_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_18_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10627668f : 
        -0.111133546f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_19 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_19_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_19_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.105643846f : 
        -0.10996251f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_20 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_20_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_20_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10507802f : 
        -0.1089251f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_21 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_21_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_21_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10457151f : 
        -0.108004004f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_22 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_22_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_22_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10411761f : 
        -0.10718458f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_23 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_23_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_23_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10371046f : 
        -0.10645434f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_24 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_24_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_24_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.103344925f : 
        -0.10580256f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_25 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_25_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_25_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.1030165f : 
        -0.10521999f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_26 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_26_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_26_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10272123f : 
        -0.10469865f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_27 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_27_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_27_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10245558f : 
        -0.10423159f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_28 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_28_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_28_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.102216445f : 
        -0.10381273f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_29 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_29_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_29_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.102001086f : 
        -0.103436776f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_30 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_30_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_30_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.101807036f : 
        -0.103099056f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_31 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_31_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_31_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.101632126f : 
        -0.10279546f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_32 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_32_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_32_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.1014744f : 
        -0.10252238f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_33 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_33_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_33_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10133212f : 
        -0.10227659f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_34 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_34_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_34_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.101203755f : 
        -0.10205526f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_35 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_35_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_35_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10108789f : 
        -0.10185586f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_36 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_36_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_36_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10098329f : 
        -0.101676136f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_37 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_37_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_37_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10088885f : 
        -0.10151409f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_38 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_38_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_38_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10080355f : 
        -0.101367936f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_39 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_39_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_39_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10072649f : 
        -0.10123607f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_40 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_40_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_40_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10065688f : 
        -0.10111706f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_41 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_41_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_41_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.100593984f : 
        -0.10100963f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_42 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_42_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_42_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.100537136f : 
        -0.10091262f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_43 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_43_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_43_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10048576f : 
        -0.10082503f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_44 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_44_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_44_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10043932f : 
        -0.1007459f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_45 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_45_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_45_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10039734f : 
        -0.10067441f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_46 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_46_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_46_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10035939f : 
        -0.100609824f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_47 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_47_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_47_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10032507f : 
        -0.100551456f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_48 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_48_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_48_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10029404f : 
        -0.1004987f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Forest_49 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_49_class_0.score0(fdata);
  }
}
class gbm_c3dff332_c747_4865_906f_7ab2c6623a31_Tree_49_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6]) || data[6 /* BMI */] < 24.5f ? 
        0.10026598f : 
        -0.100451015f);
    return pred;
  } // constant pool size = 6B, number of visited nodes = 1, static init size = 0B
}


