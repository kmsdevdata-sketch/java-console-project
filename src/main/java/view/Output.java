package view;

import domain.LearnItem;
import domain.SearchCriteria;
import dto.LearnItemSummary;
import policy.search.CategorySearch;
import policy.search.LevelSearch;
import policy.search.TagSearch;
import policy.search.TitleSearch;

import java.util.List;
import java.util.Scanner;

public class Output {

    public void printMenu() {
        System.out.println("====== 학습 관리 프로그램 ======");
        System.out.println("1.학습 항목 등록");
        System.out.println("2. 학습 항목 목록 조회");
        System.out.println("3. 학습 항목 상세 조회");
        System.out.println("4. 학습 항목 수정");
        System.out.println("5. 학습 항목 삭제");
        System.out.println("6. 검색");
        System.out.println("7. 통계");
        System.out.println("0.종료");
    }
    public void printTitleInput() {
        System.out.print("제목을 입력해주세요 :");
    }

    public void printCategoryInput() {
        System.out.print("카테고리를 선택해주세요");
        System.out.print("1.Java");
        System.out.print("2.BACKEND");
        System.out.print("3.FRONTEND");
        System.out.print("4.DATABASE");
        System.out.print("5.INFRA");
        System.out.print("6.CS");
        System.out.print("7.ETC");
    }

    public void printLevelInput() {
        System.out.print("난이도를 선택해주세요");
        System.out.print("1.BEGINNER");
        System.out.print("2.LOW");
        System.out.print("3.MEDIUM");
        System.out.print("4.HIGH");
        System.out.print("5.ADVANCED");
    }

    public void printTagInput() {
        System.out.print("태그를 입력해주세요");
    }

    public void printMemoInput() {
        System.out.print("메모를 입력해주세요");
    }

    public void printItemList(List<LearnItemSummary> items) {
        for (LearnItemSummary item : items) {
            System.out.printf(
                    "[%d] %s | %s | %s%n",
                    item.getId(),
                    item.getTitle(),
                    item.getCategory(),
                    item.getLevel()
            );
        }
    }

    public void printItemDetails(LearnItem item) {
        System.out.println(item);
    }

    public void printFindId() {
        System.out.print("조회할 ID를 입력해주세요 :");
    }

    public void printUpdateFindId() {
        System.out.print("수정할 ID를 입력해주세요 :");
    }

    public void printSelectUpdateItem() {
        System.out.print("수정할 항목을 선택해주세요");
        System.out.print("1.제목");
        System.out.print("2.카테고리");
        System.out.print("3.난이도");
        System.out.print("4.태그");
        System.out.print("5.메모");
        System.out.print("선택 :");
    }

    public void printDeleteFindId() {
        System.out.print("삭제할 ID를 입력해주세요 :");
    }

    public void askAgainDelete() {
        System.out.print("정말 삭제하시겠습니까? (y/n) :");
    }

    public void printInvalidAnswer() {
        System.out.print("y 또는 n을 입력하세요");
    }

    public void printSearchMenu() {
        System.out.print("검색 기준 선택");
        System.out.print("1. 제목 키워드");
        System.out.print("2. 카테고리");
        System.out.print("3. 태그");
        System.out.print("4. 난이도 범위");
        System.out.print("선택 :");
    }

    public void printSearchKeyword(SearchCriteria searchCriteria) {
        System.out.print(searchCriteria.getPrompt());
    }

    public void printSearchResult(List<LearnItem> items) {
        for (LearnItem item : items) {
            System.out.print(item);
        }
    }
}
