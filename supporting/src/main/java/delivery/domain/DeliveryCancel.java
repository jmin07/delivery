package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancel extends AbstractEvent {

    private Long id;

    public DeliveryCancel(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancel() {
        super();
    }
}
//>>> DDD / Domain Event
