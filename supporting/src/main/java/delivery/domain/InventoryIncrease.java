package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncrease extends AbstractEvent {

    private Long id;

    public InventoryIncrease(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncrease() {
        super();
    }
}
//>>> DDD / Domain Event
