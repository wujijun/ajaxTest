package neuedu.tools.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    public T RowMaping(ResultSet rs);

}
