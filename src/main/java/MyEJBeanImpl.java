import javax.ejb.Stateless;

@Stateless
public class MyEJBeanImpl implements MyEJBean {
    @Override
    public String getMessage() {
        return "message from EJB";
    }
}
