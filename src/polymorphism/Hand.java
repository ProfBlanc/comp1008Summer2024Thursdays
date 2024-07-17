package polymorphism;

public interface Hand {

    int FINGERS = 8;
    int THUMBS = 2;

    double grab(int duration);
    int punch(double force);
    void release();
}
