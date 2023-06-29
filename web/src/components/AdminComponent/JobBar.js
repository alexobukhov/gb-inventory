import React, {useContext} from 'react';
import {observer} from "mobx-react-lite";
import {Context} from "../../index";
import cl from "./JobBar.module.css";
import {Dropdown} from "react-bootstrap";

const JobBar = observer(() => {
    const {user} = useContext(Context)

    return (
        <Dropdown className={cl.dropdown_container}>
            <Dropdown.Toggle
                className={cl.dropdown_btn}>{user.selectedJob.name || 'Выберите должность'}</Dropdown.Toggle>
            <Dropdown.Menu className={cl.dropdown_content}>
                {user.jobs.map(job =>
                    <Dropdown.Item
                        key={job.id}
                        onClick={() => user.setSelectedJob(job)}
                    >
                        {job.name}
                    </Dropdown.Item>
                )}
            </Dropdown.Menu>
        </Dropdown>
    );
});

export default JobBar;