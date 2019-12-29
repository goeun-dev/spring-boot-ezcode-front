package org.ezcode.demo.service;

import java.util.List;

import org.ezcode.demo.domain.ProductPagingDTO;
import org.ezcode.demo.domain.ProductVO;

/**
 * ProductService
 */
public interface ProductService {

    // 상품 등록
    public void register(ProductVO vo);

    // 상품 수정
    public void modify(ProductVO vo);

    // 상품 삭제
    public int delete(Integer pno);
    
    // 상품 목록
    public List<ProductVO> list(ProductPagingDTO dto);

    // 상품 상세
    public ProductVO findByPno(Integer pno);

    //파일 삭제
    public int fileDelete(String uuid);
    
    // 카운트 (페이징)
    public int getCount(ProductPagingDTO dto);

    // 별점 평균
    public Double ratingGrade(Integer pno);

    //리뷰 개수
    public Integer cntReview(Integer pno);
}