package insper.store.partner;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PartnerOut (
    String id,
    String name,
    String email
) {}

