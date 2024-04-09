package insper.store.partner;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "store-partner")
public interface PartnerController {

    @PostMapping("/partner")
    ResponseEntity<PartnerOut> create (
        @RequestBody(required = true) PartnerIn in
    );

    @GetMapping("/partner")
    ResponseEntity<List<PartnerOut>> read();

    @PutMapping("/partner/{id}")
    public ResponseEntity<PartnerOut> update (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) PartnerIn in
    );

    @DeleteMapping("/partner/{id}")
    public ResponseEntity<?> delete(String id);
}