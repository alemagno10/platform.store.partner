package insper.store.partner;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PartnerIn (
    String name,
    String email,
    String password
) {}