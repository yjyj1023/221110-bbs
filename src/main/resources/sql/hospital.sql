//경기도 수원시에 있는 피부과
SELECT * FROM `likelion-db`.nation_wide_hospitals
where (full_address like "%수원시%"
and
hospital_name like "%피부%")

//특정 구의 - 보건진료소, 보건지소, 보건소 모두 찾기
SELECT business_type_name, hospital_name, road_name_address
FROM `likelion-db`.nation_wide_hospitals
where business_type_name in ('보건소', '보건지소')
;