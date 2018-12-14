package neuedu.test.day1213.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    public T RowMaping(ResultSet rs);

}
