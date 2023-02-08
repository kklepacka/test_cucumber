# language: en
Feature: Test_cuke

	Scenario: Test_cuke
		Given test '
		Given Test ` echo test `
		Given Test $test
		Given Test & echo toto
		Given Test ; echo toto
		Given Test | echo toto
		Given Test ^
		Given Test %test%
		Given Test ${echo test}
		Given Test $(echo test)
		Given Test #test
		Given Test 𨱏
		Given Test 👩‍❤️‍💋‍👨
		Given Test [test]
		Given Test ^^
		Given Test ,.+-_~@€çé=àû*?!
		Given Test ./test