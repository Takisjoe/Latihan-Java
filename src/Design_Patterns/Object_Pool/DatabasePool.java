package Design_Patterns.Object_Pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DatabasePool {
    private List<Connection> pool = new ArrayList<>();

}
