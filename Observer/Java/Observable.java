import java.util.List;
import java.util.ArrayList;

public class Observable<T> implements IObservable<T> {
    private List<IObserver<T>> observers;
    private T value;
    
    public Observable() {
        this.observers = new ArrayList<IObserver<T>>();
    }

    @Override
    public void subscribe(IObserver<T> observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver<T> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void updateAll() {
        for (IObserver<T> observer : this.observers) {
            observer.update(this.getValue());
        }
    }

    public void setValue(T value) {
        this.value = value;
        this.updateAll();
    }

    public T getValue() {
        return this.value;
    }
}

interface IObservable<T> {
    public void subscribe(IObserver<T> observer);
    public void unsubscribe(IObserver<T> observer);
    public void updateAll();
}