package com.sstep.demo.weekschedule.domain;

import com.sstep.demo.member.domain.Member;
import com.sstep.demo.staff.domain.Staff;
import com.sstep.demo.store.domain.Store;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Builder
public class WeekSchedule { //요일별 근무시간 도메인
    @Id //기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 생성을 DB에 위임 => DB에서 AUTO_INCREMENT 기능 사용
    private long id; //요일별 근무시간 고유번호
    @Column(nullable = false)
    private int weekDay; //월요일 = 1 ~ 일요일 = 7
    private LocalTime startTime; //출근해야할 시간 (HH:MM:SS)
    private LocalTime endTime;  //퇴근해야할 시간

    public WeekSchedule(long id, int weekDay, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.weekDay = weekDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //직원 테이블과 1대다 조인
    @ManyToOne
    private Staff staff;
}
