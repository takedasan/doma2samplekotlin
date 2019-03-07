select
    p.person_id,
    p.name,
    p.sex_type,
    a.address_id,
    a.address
from
    person p
left join address a
    on p.person_id = a.person_id
where
    a.address_id = /* addressId */1
;