import java.util.ArrayList;
import java.util.List;
 
public class MessagePublisher implements Subject {
     
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer o) {
    	observerList.add(o);
    }
 
    @Override
    public void detach(Observer o) {
    	observerList.remove(o);
    }
 
    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observerList) {
            o.update(m);
        }
    }
}