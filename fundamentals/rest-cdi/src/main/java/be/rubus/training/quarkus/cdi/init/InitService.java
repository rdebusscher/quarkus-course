package be.rubus.training.quarkus.cdi.init;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class InitService {

    private Date initMoment;

    @PostConstruct
    void init() {
        initMoment = new Date();
    }

    public Date getInitMoment() {
        return initMoment;
    }
}
