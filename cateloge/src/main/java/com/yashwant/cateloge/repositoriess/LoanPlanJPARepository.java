package com.yashwant.cateloge.repositoriess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashwant.cateloge.entitiess.LoanPlanJPA;

@Repository
public interface LoanPlanJPARepository extends JpaRepository<LoanPlanJPA, Integer> {

}
