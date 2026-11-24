package ro.info.uvt.tema1.observer;

import org.springframework.stereotype.Component;
import ro.info.uvt.tema1.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Book lastBook;

    public void add(Book book) {
        this.lastBook = book;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lastBook);
        }
    }
}