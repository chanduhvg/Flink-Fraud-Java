package edu.nwmissouri.bigdata.section01.group4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //Even number fraud detection
//        EvenNumber evenNumber=new EvenNumber();
//        evenNumber.FraudDetectEvenNumber();
//        
//        OddNumber odd=new OddNumber();
//        odd.OddNumberDetection();
        

        StringLength string = new StringLength();
        string.FraudDetectStringLength();

        Squarenumberornot odd=new Squarenumberornot();
        odd.OddNumberDetection();

    }
}
