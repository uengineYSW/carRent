package carrent.domain;

import carrent.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "generalrents",
    path = "generalrents"
)
public interface GeneralRentRepository
    extends PagingAndSortingRepository<GeneralRent, Long> {}
