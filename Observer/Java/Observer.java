public class Observer<T> implements IObserver<T> {
    private IObservable<T> observable = null;
        
    public Observer() {

    }

    public Observer(IObservable<T> observable) {
        this.setObservable(observable);
    }

    public void setObservable(IObservable<T> observable) {
        if (this.observable != null)
            this.observable.unsubscribe(this);
        this.observable = observable;
        if (this.observable != null)
            this.observable.subscribe(this);
    }

    @Override
    public void update(T data) {
        System.out.println("Observer updated: " + data);
    }
}

interface IObserver<T> {
    public void update(T data);
}