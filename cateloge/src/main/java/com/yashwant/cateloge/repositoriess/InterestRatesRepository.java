package com.yashwant.cateloge.repositoriess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashwant.cateloge.entitiess.InterestRatesEntity;

@Repository
public interface InterestRatesRepository extends JpaRepository<InterestRatesEntity,String> {

}
