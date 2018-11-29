package com.challenge.phoneApp;

import org.springframework.data.jpa.repository.JpaRepository;

interface PhoneRepository extends JpaRepository<Phone, Long> {

}
