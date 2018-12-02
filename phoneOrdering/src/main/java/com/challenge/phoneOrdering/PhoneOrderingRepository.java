package com.challenge.phoneOrdering;

import org.springframework.data.jpa.repository.JpaRepository;

interface PhoneOrderingRepository extends JpaRepository<PhoneOrder,Long> {

}
