package jp.takeda.doma2sample.dao;

import jp.takeda.doma2sample.domain.model.read.AddressReadEntity;
import jp.takeda.doma2sample.domain.model.write.AddressEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao
@ConfigAutowireable
public interface AddressDomaDao {
    @Select
    List<AddressReadEntity> search();

    @Select(ensureResult = true)
    AddressReadEntity find(int addressId);

    @Insert
    Result<AddressEntity> insert(AddressEntity address);
}
