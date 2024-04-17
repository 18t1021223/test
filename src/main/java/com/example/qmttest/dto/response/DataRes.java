package com.example.qmttest.dto.response;

import com.example.qmttest.constants.SystemMessage;
import lombok.*;

import java.util.Collection;
import java.util.Map;

/**
 * @author NhatPA
 * @since 23/03/2022 - 08:14
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public sealed class DataRes<T> permits DataRes.ListDataRes, DataRes.PageDataRes, DataRes.MapDataRes {

    /**
     * The status code of the response.
     */
    private int code;

    /**
     * The data contained in the response.
     */
    private T data;

    /**
     * Static factory method to create a DataRes instance with the given status code and data.
     *
     * @param status The status code.
     * @param data   The data to be wrapped.
     * @param <T>    The type of data.
     * @return A DataRes instance.
     */
    public static <T> DataRes<T> build(int status, T data) {
        return new DataRes<>(status, data);
    }

    /**
     * The response data includes the status and its corresponding message.
     */
    public static DataRes<String> build(SystemMessage systemMessage) {
        return build(systemMessage.getCode(), systemMessage.getMessage());
    }

    /**
     * The response data includes the OK status and no data.
     */
    public static DataRes<String> ok() {
        return build(SystemMessage.SUCCESS);
    }

    /**
     * The response data includes the OK status and data.
     */
    public static <T> DataRes<T> ok(T data) {
        return build(SystemMessage.SUCCESS.getCode(), data);
    }

    /**
     * The response data includes the OK status and a list of data.
     */
    public static <L> DataRes<Collection<L>> list(Collection<L> dataList) {
        return build(SystemMessage.SUCCESS.getCode(), dataList);
    }

    /**
     * The response data includes the bad status and no data.
     */
    public static DataRes<String> bad() {
        return build(SystemMessage.BAD_REQUEST);
    }

    /**
     * The response data includes the bad status and data
     */
    public static <T> DataRes<T> bad(T error) {
        return build(SystemMessage.BAD_REQUEST.getCode(), error);
    }

    /**
     * The response data includes the bad status and an external message
     */
    public static DataRes<String> internalErr(String errMessage) {
        return build(SystemMessage.INTERNAL_SERVER.getCode(), errMessage);
    }

    /**
     * Subclass of DataRes for wrapping lists of data.
     *
     * @param <L> The type of elements in the list.
     */
    public static final class ListDataRes<L> extends DataRes<Collection<L>> {
        public ListDataRes(int code, Collection<L> data) {
            super(code, data);
        }

        public static <T> ListDataRes<T> ok(Collection<T> list) {
            return new ListDataRes<>(SystemMessage.SUCCESS.getCode(), list);
        }
    }

    /**
     * Subclass of DataRes for wrapping maps of data.
     *
     * @param <K> The type of keys in the map.
     * @param <V> The type of values in the map.
     */
    public static final class MapDataRes<K, V> extends DataRes<Map<K, V>> {
        public MapDataRes(int code, Map<K, V> data) {
            super(code, data);
        }

        public static <K, V> MapDataRes<K, V> ok(Map<K, V> map) {
            return new MapDataRes<>(SystemMessage.SUCCESS.getCode(), map);
        }
    }

    /**
     * Subclass of DataRes for wrapping paginated data.
     *
     * @param <P> The type of data on each page.
     */
    public static final class PageDataRes<P> extends DataRes<PageRes<P>> {
        public PageDataRes(int code, PageRes<P> data) {
            super(code, data);
        }

        public static <T> PageDataRes<T> ok(PageRes<T> list) {
            return new PageDataRes<>(SystemMessage.SUCCESS.getCode(), list);
        }
    }
}
