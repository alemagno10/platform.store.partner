package insper.store.partner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-partner")
public interface PartnerController {

    @PostMapping("/partner")
    ResponseEntity<PartnerOut> create (
        @RequestBody(required = true) PartnerIn in
    );

    @GetMapping("/partner")
    ResponseEntity<PartnerOut> read (
        @RequestHeader(required = true, name = "id-partner") String idPartner
    );

    @PutMapping("/partner/{id}")
    public ResponseEntity<PartnerOut> update (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) PartnerIn in
    );
}