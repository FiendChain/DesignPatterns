public class ObserverDemo {
    public static void main(String[] args) {
        Observable<Integer> observable = new Observable<Integer>();
        Observer<Integer> observer = new Observer<Integer>(observable);

        observable.setValue(20);
        observable.setValue(10);

        System.out.println("Unsubscribing from observable");
        observer.setObservable(null);
        observable.setValue(100);
    }
}