public interface IWindow: IWidget
{
    void resize(float x, float y);
    void minimise();
    void maximise();
    void close();
}