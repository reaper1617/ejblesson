import javax.ejb.Remote;

@Remote
public interface MyEJBean {
    String getMessage();
}
