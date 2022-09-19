package carrent.domain;

import carrent.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "leases", path = "leases")
public interface LeaseRepository
    extends PagingAndSortingRepository<Lease, Long> {}
