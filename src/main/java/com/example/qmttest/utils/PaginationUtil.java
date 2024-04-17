package com.example.qmttest.utils;

import com.example.qmttest.dto.request.PageReqDto;
import com.example.qmttest.dto.request.SortReqDto;
import com.example.qmttest.dto.response.PageRes;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class for pagination-related operations.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PaginationUtil {
    /**
     * Default number of records per page.
     */
    public static final int DEFAULT_RECORD_PER_PAGE = 20;

    /**
     * Default current page number.
     */
    public static final int DEFAULT_CURRENT_PAGE = 0;

    /**
     * Maximum limit size.
     */
    public static final int MAX_LIMIT_SIZE = 100;

    /**
     * Default sort field.
     */
    public static final String DEFAULT_SORT_FIELD = "id";

    /**
     * Default sort direction.
     */
    public static final Sort.Direction DEFAULT_SORT_DIRECTION = Sort.Direction.ASC;

    /**
     * Default sort configuration.
     */
    public static final Sort DEFAULT_SORT = Sort.by(DEFAULT_SORT_DIRECTION, DEFAULT_SORT_FIELD);

    public static final String SPLIT_DELIMITERS = "-";

    //region Build request

    /**
     * Builds a PageRequest object based on the provided PageReqDto.
     *
     * @param dto The PageReqDto object containing pagination parameters.
     * @return PageRequest object based on the provided parameters.
     */
    public static PageRequest build(PageReqDto dto) {
        return PageRequest.of(
                getPage(dto.getPage()),
                getLimit(dto.getLimit()),
                getSort(dto.getSorts())
        );
    }

    /**
     * Builds a PageRequest object based on the provided page number and limit.
     *
     * @param page  The page number.
     * @param limit The limit size.
     * @return PageRequest object based on the provided parameters.
     */
    public static PageRequest build(Integer page, Integer limit) {
        return PageRequest.of(
                getPage(page),
                getLimit(limit)
        );
    }

    private static int getPage(Integer page) {
        if (page == null) {
            return DEFAULT_CURRENT_PAGE;
        }
        return page > 0 ? page - 1 : DEFAULT_CURRENT_PAGE;
    }

    private static int getLimit(Integer limit) {
        if (limit == null || limit <= 0) {
            return DEFAULT_RECORD_PER_PAGE;
        }
        return limit <= MAX_LIMIT_SIZE ? limit : MAX_LIMIT_SIZE;
    }

    /**
     * Gets the Sort object based on the provided list of SortReqDto.
     *
     * @param stringSorts The list of SortReqDto objects containing sorting parameters.
     * @return Sort object based on the provided parameters.
     */
    public static Sort getSort(String[] stringSorts) {
        if (ObjectUtils.isEmpty(stringSorts)) {
            return DEFAULT_SORT;
        }
        return Sort.by(buildOrder(stringSorts));
    }
    //endregion

    //region Build response

    /**
     * Builds a PageRes object from a Page object.
     *
     * @param page The Page object.
     * @param <T>  The type of records in the Page.
     * @return PageRes object containing pagination information.
     */
    public static <T> PageRes<T> buildPageRes(final Page<T> page) {
        PageRes<T> res = new PageRes<>();
        res.setRecords(page.getContent());
        res.setPage(page.getNumber() + 1);
        res.setLimit(page.getSize());
        res.setTotal(page.getTotalElements());
        res.setTotalPage(page.getTotalPages());
        return res;
    }
    //endregion

    //region Sort

    private static List<Sort.Order> buildOrder(String[] sortReqs) {
        return Arrays.stream(sortReqs)
                .map(s -> s.split(SPLIT_DELIMITERS))
                .map(s -> new SortReqDto(s[0], DEFAULT_SORT_DIRECTION.name().equalsIgnoreCase(s[1])))
                .map(s -> s.isAsc() ? Sort.Order.asc(s.getColumn()) : Sort.Order.desc(s.getColumn()))
                .toList();
    }
    //endregion
}

