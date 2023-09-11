import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database{
    void load();

    void save();

    Collection<Entity> getAll();
    void setAll(Collection<Entity> entities);
}