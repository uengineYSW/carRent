package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Registered extends AbstractEvent {

    private Long id;
    private Long userId;
    private String userName;
    private Date birthDate;
    private Date phoneNo;
    private Integer age;

    public Registered(MemberManagementSystem aggregate) {
        super(aggregate);
    }

    public Registered() {
        super();
    }
    // keep

}
