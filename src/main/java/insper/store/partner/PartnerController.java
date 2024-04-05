package insper.store.partner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "store-partner")
public interface PartnerController {

    @PostMapping("/partner")
    ResponseEntity<PartnerOut> create (
        @RequestBody(required = true) PartnerIn in
    );

    @GetMapping("/partner")
    ResponseEntity<LoginOut> read (
        @RequestHeader(required = true, name = "id-partner") String idUser
    );

    @PutMapping("/partner/{id}")
    public ResponseEntity<AccountOut> update (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) AccountIn in
    );
}