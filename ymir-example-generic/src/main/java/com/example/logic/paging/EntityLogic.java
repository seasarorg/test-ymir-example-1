package com.example.logic.paging;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.ymir.render.Paging;

import com.example.dto.paging.EntityDto;

public class EntityLogic {
    private List<EntityDto> entityList;

    public EntityLogic() {
        entityList = new ArrayList<EntityDto>();
        for (int i = 1; i <= 95; i++) {
            entityList.add(new EntityDto("説明" + i, i, "名前" + i));
        }
    }

    public PagingResultBean<EntityDto> selectPage(int countByPage,
            int pageNumber) {
        List<EntityDto> list = new ArrayList<EntityDto>();
        int startIndex = (pageNumber - 1) * countByPage;
        if (startIndex < 0) {
            startIndex = 0;
        }
        int endIndex = pageNumber * countByPage;
        if (endIndex > entityList.size()) {
            endIndex = entityList.size();
        }
        for (int i = startIndex; i < endIndex; i++) {
            list.add(entityList.get(i));
        }
        return new PagingResultBean<EntityDto>(list, new Paging(entityList
                .size(), (entityList.size() + countByPage - 1) / countByPage,
                countByPage, pageNumber, 2));
    }
}
