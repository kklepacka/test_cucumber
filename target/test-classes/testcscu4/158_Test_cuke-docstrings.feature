# language: en
Feature: Test_cuke-docstrings

	Scenario: Test_cuke-docstrings
		Given test '
			"""
			test '
			"""
		Given Test ` echo test `
			"""
			Test ` echo test `
			"""
		Given Test $test
			"""
			Test $test
			"""
		Given Test & echo toto
			"""
			Test & echo toto
			"""
		Given Test ; echo toto
			"""
			Test ; echo toto
			"""
		Given Test | echo toto
			"""
			Test | echo toto
			"""
		Given Test ^
			"""
			Test ^
			"""
		Given Test %test%
			"""
			Test %test%
			"""
		Given Test ${echo test}
			"""
			Test ${echo test}
			"""
		Given Test $(echo test)
			"""
			Test $(echo test)
			"""
		Given Test #test
			"""
			Test #test
			"""
		Given Test 𨱏
			"""
			Test 𨱏
			"""
		Given Test 👩‍❤️‍💋‍👨
			"""
			Test 👩‍❤️‍💋‍👨
			"""
		Given Test [test]
			"""
			Test [test]
			"""
		Given Test ^^
			"""
			Test ^^
			"""
		Given Test ,.+-_~@€çé=àû*?!
			"""
			Test ,.+-_~@€çé=àû*?!
			"""
		Given Test ./test
			"""
			Test ./test
			"""