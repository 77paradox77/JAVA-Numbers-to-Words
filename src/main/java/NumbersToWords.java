import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {
  public static void main(String[] args){

  }


public static String turnNumbersToWords(Integer input) {
  HashMap<Integer, String> conversion = new HashMap<Integer,String>();
    conversion.put(1, "one");

  for (Integer index = 0; index <= input; index++){
    if(index == 1){
      return "one";
    }
    else{
      return "nope";
    }
  }

}
}
}
