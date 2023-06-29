import React, {useContext} from 'react';
import {observer} from "mobx-react-lite";
import { Dropdown} from "react-bootstrap";
import {Context} from "../../index";
import cl from './JobBar.module.css'


const DepartmentBar = observer(() => {
    const {user} = useContext(Context)

    return (
        <Dropdown className={cl.dropdown_container}>
            <Dropdown.Toggle
                className={cl.dropdown_btn}>{user.selectedDepartment.name || 'Выберите отдел'}</Dropdown.Toggle>
            <Dropdown.Menu className={cl.dropdown_content}>
                {user.departments.map(department =>
                    <Dropdown.Item
                        onClick={() => user.setSelectedDepartment(department)}
                        key={user.id}
                    >
                        {department.name}
                    </Dropdown.Item>
                )}
            </Dropdown.Menu>
        </Dropdown>
    );
});

export default DepartmentBar;