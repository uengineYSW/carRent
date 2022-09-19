package carrent.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "carRental", url = "${api.url.carRental}")
public interface CarRentSystemService {
    @RequestMapping(
        method = RequestMethod.PUT,
        path = "/carRentSystems/{id}/pay"
    )
    public void pay(@PathVariable("id") Long rentId);
    // keep

}
