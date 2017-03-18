package tehnotrek;

/**
 * Created by Developer on 3/9/2017.
 */
public class MainApp {

    class StringWrp{
        private String in;

        public StringWrp(String in){
            this.in = in;
        }

        public String getIn(){
            return in;
        }

        public void setIn(String in){
            this.in = in;
        }
    }


    StringWrp getStringWrp(String value){
        return new StringWrp(value);
    }

   public static void main(String... args){

       MainApp bProm = new MainApp();
      /* StringWrp bb = bProm.new StringWrp("b"); - this is the same like next line*/
       StringWrp bb = bProm.getStringWrp("b");
       MainApp zProm = new MainApp();
       StringWrp zz = zProm.getStringWrp("a");
       StringWrp aa = zz;

       /*StringWrp pp.StringWrp = new StringWrp("a");
       StringWrp exam = new MainApp(new StringWrp("a"));
       StringWrp z = new StringWrp("a");*/

       bProm.someMethod(aa, bb);
       System.out.println("z = " + zz.getIn());
}

    void someMethod (StringWrp a, StringWrp b){
        String c = a.getIn();
        a.setIn(b.getIn());
        b.setIn(c);
        System.out.println("a = " + a.getIn() + ", b = " + b.getIn());
    }



}
