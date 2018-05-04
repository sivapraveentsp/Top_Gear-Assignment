package Core_java;
import java.util.ArrayList;
import java.util.List;
 
public class threading {
 
    public static List<String> names = new ArrayList<String>(); 
     
    public static void main(String a[]){
        List<SampleThread> list = new ArrayList<SampleThread>();
        for(int i=0;i<5;i++){
            SampleThread s = new SampleThread();
            list.add(s);
            s.start();
        }
        for(SampleThread st:list){
            try{
                st.join();
            } catch (Exception ex){}
        }
        System.out.println(names);
    }
}
 
class SampleThread extends Thread{
     
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(10);
            } catch(Exception ex){}
        }
        threading.names.add(getName());
    }
}