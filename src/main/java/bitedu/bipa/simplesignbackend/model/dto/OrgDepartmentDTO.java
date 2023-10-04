package bitedu.bipa.simplesignbackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrgDepartmentDTO {
    private int deptId;
    private String deptName;
    private int upperDeptId;
    private List<OrgDepartmentDTO> subDepts;
}
